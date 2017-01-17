import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {UserProfile} from './UserProfile.model';
import 'rxjs/add/operator/map';

@Injectable()
export class GridService {

    constructor(private http: Http) {}

    getAllUsers() {

        console.log('GridService #getAllUsers # begin !!!');
        // return this.http.get('http://localhost:8080/v1/userProfiles/yandaguditas')
        //             .toPromise()
        //             .then(res => <UserProfile[]> res.json().data)
        //             .then(data => { return data; });
        let url = 'http://localhost:8080/v1/userProfiles/allUsers';
        return this.http.get(url).map((res: Response) => res.json());

    }

    saveUserProfile(userProfile: UserProfile) {
         console.log('GridService #getAllUsers # begin !!!');
          let url = 'http://localhost:8080/v1/userProfiles/saveUser';
          
          return this.http.post(url, userProfile);  
    }
}
