import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { tap, delay } from 'rxjs/operators';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from '../../environments/environment';
import { User } from "../user";
var username = 'cloudsimpleservice';
var password = 'mysecret';

const httpOptions = {
  headers: new HttpHeaders({ 'Authorization': "Basic " + btoa(username + ':' + password) })
};

@Injectable({
  providedIn: 'root'
})
export class SignupSellerService {

  constructor(private http: HttpClient) { }

  private name:string = 'token'
  postSignUp(user:User):Observable<any> {
    sessionStorage.setItem(this.name,'a')
    return this.http.post(`http://localhost:6667/api/cloud-user-service/api/user/Authorization = regist`, JSON.stringify(user), httpOptions);
  }

}
