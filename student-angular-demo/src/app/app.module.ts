import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpClientModule, HttpClientXsrfModule } from '@angular/common/http';
import { DataService } from './data.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddStudentComponent } from './add-student/add-student.component';

@NgModule({
  declarations: [
    AppComponent,
    AddStudentComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpClientXsrfModule.withOptions({
      cookieName: 'My-Xsrf-Cookie',
      headerName: 'My-Xsrf-Header',
    }),
    FormsModule,
    ReactiveFormsModule 
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
