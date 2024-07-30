import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import {FormsModule} from '@angular/forms';
import {HTTP_INTERCEPTORS, HttpClient, HttpClientModule} from '@angular/common/http';
import {CodeInputModule} from 'angular-code-input';
import {LoginComponent} from "./pages/login/login.component";
import {AppComponent} from "./app.component";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent
    // RegisterComponent,
    // ActivateAccountComponent
  ],
  imports: [
    BrowserModule,
  //  AppRoutingModule,
    FormsModule,
    HttpClientModule,
    CodeInputModule
  ],
  providers: [
    HttpClient,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: HttpTokenInterceptor,
      multi: true
    },

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
