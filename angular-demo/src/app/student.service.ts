import { Injectable } from '@angular/core';

import {HttpClient , HttpHeaders } from '@angular/common/http';
import { forkJoin } from 'rxjs'

import {BehaviorSubject} from 'rxjs';
import {Observable} from 'rxjs';
import {environment} from '../environments/environment';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({ 
  providedIn: 'root'
})
export class StudentService {

  constructor(private http:HttpClient) { 
    console.log(" >>>>>>>>>> Student Service Object >>>>>>>>>>>>>")    
  }

  public getStudents(){
    //Back End
    //API Call
    console.log(" >>>>>>>>>> getStudents >>>>>>>>>>>>>")  
    let headersData = new HttpHeaders();
    //headersData = headersData.set('Content-Type', 'application/json; charset=utf-8');
   // headersData = headersData.set("Authorization", "Basic " + btoa(environment.studentPassword +":"+ environment.studentPassword));
    return this.http.get(environment.apiStudentURL, {
      headers: new HttpHeaders({"Authorization" : "Basic " + btoa(environment.studentPassword +":"+ environment.studentPassword) })
    });
  }

  public getTreatments() : Observable<any>{
    console.log(' >>>>>>>>>>>>>>> GetTreatments >>>>>>>>>>>>>>>>');
    return this.http.get(environment.apiTreatmentURL,httpOptions);
  }


}
