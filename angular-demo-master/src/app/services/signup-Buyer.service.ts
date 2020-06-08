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
export class SignupService {

  constructor(private http: HttpClient) { }

  private name:string = 'token'
  postSignUp(user:User):Observable<any> {
    localStorage.setItem(this.name,'')
    return this.http.post(`${environment.baseUrl}/api/cloud-user-service/api/user/token?grant_type=password&scope=webclient`, JSON.stringify(user), httpOptions);
  }

}
