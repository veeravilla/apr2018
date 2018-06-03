import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit {

 /* courseList= [
    {id: "1", title:"Java"},
    {id:"2",title:"MCA"},
    {id:"3", title:"MS"}
  ]*/

  courseList;

  constructor(private dataService:DataService) {
  console.log(" Get Data From BackEnd !!!!") 
    this.getCourses();
   }

  ngOnInit() {
  }

  log(sname){
    console.log(sname);
  }

  addStudent(sform){
    console.log(sform.value)
  }

  public getCourses(){
    this.dataService.getCourse().subscribe(
      res => {
        console.log(res);
        this.courseList = res;
      } ,
      err => console.error(err), () => console.log(' Done !! Loading Course Details !! ')
    );
  }
}
