import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { CustomerComponent } from './customer.component';
import { RoomsComponent } from '../admin/components/rooms/rooms.component';


const routes: Routes = [
  { path: '', component: CustomerComponent },
  { path: 'rooms', component: RoomsComponent },
];

@NgModule({
  declarations: [
    CustomerComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ]
})
export class CustomerModule { }
