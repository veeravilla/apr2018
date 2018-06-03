import { Component } from '@angular/core';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  treatmentAPIResponse:any;
  studentAPIResponse:any;
  courseAPIResponse:any;

  constructor(private dataService:DataService){
   /* this.getTreatments();
    this.getStudents();
    this.getCourses(); */
  }

  public getTreatments(){
    this.dataService.getTreatments().subscribe(
      res => {
        console.log(res);
        this.treatmentAPIResponse = res;
      } ,
      err => console.error(err), () => console.log(' Done !! Loading Treatment Details !! ')
    );
  }

  public getStudents(){
    this.dataService.getStudents().subscribe(
      res => {
        console.log(res);
        this.studentAPIResponse = res;
      } ,
      err => console.error(err), () => console.log(' Done !! Loading Students Details !! ')
    );
  }

  public getCourses(){
    this.dataService.getCourse().subscribe(
      res => {
        console.log(res);
        this.courseAPIResponse = res;
      } ,
      err => console.error(err), () => console.log(' Done !! Loading Course Details !! ')
    );
  }


}
