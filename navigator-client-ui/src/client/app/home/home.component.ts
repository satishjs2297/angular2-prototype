import { Component, OnInit } from '@angular/core';
import { NameListService } from '../shared/name-list/name-list.service';
import {ConfirmationService, Message} from "primeng/components/common/api";

/**
 * This class represents the lazy loaded HomeComponent.
 */
@Component({
  moduleId: module.id,
  selector: 'sd-home',
  templateUrl: 'home.component.html',
  styleUrls: ['home.component.css'],
  providers:  [ConfirmationService]
})
export class HomeComponent implements OnInit {

  newName: string = '';
  errorMessage: string;
  names: any[] = [];
  clicks: number = 0;

  name: string;
  userResponse: Message[]=[];
  theUserSaid: string;

  selectedCities: string[] = ['New York'];

  /**
   * Creates an instance of the HomeComponent with the injected
   * NameListService.
   *
   * @param {NameListService} nameListService - The injected NameListService.
   */
  constructor(public nameListService: NameListService, 
              private confirmationService: ConfirmationService) {}

  /**
   * Get the names OnInit
   */
  ngOnInit() {
    this.getNames();
  }

  /**
   * Handle the nameListService observable
   */
  getNames() {
    this.nameListService.get()
      .subscribe(
        names => this.names = names,
        error => this.errorMessage = <any>error
      );
  }

  /**
   * Pushes a new name onto the names array
   * @return {boolean} false to prevent default form submit behavior to refresh the page.
   */
  addName(): boolean {
    // TODO: implement nameListService.post
    this.names.push(this.newName);
    this.newName = '';
    this.clicks++;
    return false;
  }

  onChangeEvent({target}){
      this.name = target.value;
      console.log(this.name);
  }

  greetMe(){

      this.confirmationService.confirm({
          message: ` Hey ${this.name}, do you like PrimeNG?`,
          header: 'Greeting',
          icon: 'fa fa-question-circle',
          accept: () => {
              this.userResponse = [];
              this.userResponse.push({severity:'info', summary:'Confirmed', detail:'I like PrimeNG'});
              this.theUserSaid = this.name + " responded " + this.userResponse[0].detail;
          },
          reject: () => {
              this.userResponse = [];
              this.userResponse.push({severity:'info', summary:'Rejected', detail:'I don\'t really like PrimeNG'});
              this.theUserSaid = this.name + " responded " + this.userResponse[0].detail;
          }
      });
  }  
}
