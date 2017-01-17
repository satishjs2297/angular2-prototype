import { Component, OnInit } from '@angular/core';
import { UserProfile } from './UserProfile.model';
import { GridService } from './gridservice';


@Component({
    moduleId: module.id,
    selector: 'sd-grid',
    templateUrl: 'grid.component.html',
})
export class GridComponent implements OnInit {

    displayDialog: boolean;
    anyErrors: any;

    selectedCar: UserProfile;
    newUser: boolean;
    userProfiles: UserProfile[];
    userProfile: UserProfile;
    saveStatus: any;



    constructor(private gridService: GridService) { }

    ngOnInit() {
        this.gridService.getAllUsers().subscribe(userProfiles => this.userProfiles = userProfiles,
            error => this.anyErrors = error);
    }

    showDialogToAdd() {
        this.newUser = true;
        this.displayDialog = true;
    }

    save() {
        if (this.newUser)
            this.userProfiles.push(this.userProfile);
        else
            this.userProfiles[this.findSelectedCarIndex()] = this.userProfile;
        this.gridService.saveUserProfile(this.userProfile).subscribe(saveStatus => this.saveStatus = saveStatus,
            error => this.anyErrors = error);
        this.userProfile = null;
        this.displayDialog = false;
    }

    delete() {
        this.userProfiles.splice(this.findSelectedCarIndex(), 1);
        this.userProfiles[this.findSelectedCarIndex()];
        this.userProfile = null;
        this.displayDialog = false;
    }

    onRowSelect(event) {
        this.newUser = false;
        this.userProfile = this.cloneCar(event.data);
        this.displayDialog = true;
    }

    //Need to modify here 
    cloneCar(c: UserProfile): UserProfile {
        let car = new UserProfile();
        for (let prop in c) {

        }
        return c;
    }


    findSelectedCarIndex(): number {
        return this.userProfiles.indexOf(this.selectedCar);
    }
}
