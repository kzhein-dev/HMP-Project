import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserStorageService } from './auth/services/storage/user-storage.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'App';
  isCustomerLoggedIn: boolean = UserStorageService.isCustomerLoggedIn();
isAdminLoggedIn: boolean = UserStorageService.isAdminLoggedIn();

constructor(private router: Router) { }
ngOnInit(){
  this.router.events.subscribe(event => {
    if (event.constructor.name === "NavigationEnd") {
        this.isCustomerLoggedIn = UserStorageService.isCustomerLoggedIn();
        this.isAdminLoggedIn = UserStorageService.isAdminLoggedIn();
    }
});
}

logout(){
  UserStorageService.signOut();
  this.router.navigateByUrl('/');
}
}
