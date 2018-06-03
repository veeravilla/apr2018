import { Injectable } from '@angular/core';
import {HttpClient , HttpHeaders } from '@angular/common/http';

import {BehaviorSubject} from 'rxjs';
import {Observable} from 'rxjs';
import {environment} from '../environments/environment';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' ,
  "Authorization" : "Basic " + btoa(environment.studentUserName +":"+ environment.studentPassword)})
};

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http:HttpClient) { 
    console.log(" >>>>>>>>>> Data Service Object >>>>>>>>>>>>>")    
  }

 //External API Call
  public getTreatments() : Observable<any>{
    return this.http.get(environment.apiTreatmentURL);
  }

 //With Security
  public getStudents() : Observable<any>{
   // return this.http.get(environment.apiStudentURL,httpOptions);

    return this.http.get(environment.apiStudentURL, {
      headers: new HttpHeaders({"Authorization" : "Basic " + btoa(environment.studentUserName +":"+ environment.studentPassword) })
    });
  }

 //Mock API Call
  public getCourse() : Observable<any>{
    return this.http.get(environment.mockAPIUrl);
  }
}
