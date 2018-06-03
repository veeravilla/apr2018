import { Component } from '@angular/core';
import { StudentService } from './student.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Student Demo Applicaiton';
 // studentService;
  treatmentResponse;
  studentResponse;
 // students =["Rama","Krishna","Jhon","Ken"]

  constructor(public studentService:StudentService){
     console.log(" >>>>>> Injected Student Service Object");
    // this.studentService = studentService;
     this.getTreatments();
     this.getStudents();
  }

  getTreatments(){
 this.studentService.getTreatments().subscribe(
      res => {
        console.log(res);
        this.treatmentResponse = res;
      } ,
      err => console.error(err), () => console.log(' Done !! Loading Treatment Details !! ')
    );
   // this.apiResponse = this.studentService.getStudents();
  }

  getStudents(){
    this.studentService.getStudents().subscribe(
        res => {
          console.log(res);
          this.studentResponse = res;
        } ,
        err => console.error(err), () => console.log(' Done !! Loading Student Details !! ')
      );
     // this.apiResponse = this.studentService.getStudents();
    }
}
