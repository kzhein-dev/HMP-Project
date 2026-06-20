import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { PostRoomComponent } from './components/post-room/post-room.component'; 
import { ReactiveFormsModule } from '@angular/forms'
import { NzCardModule } from 'ng-zorro-antd/card';
import { NzSkeletonModule } from 'ng-zorro-antd/skeleton';
import { NzAvatarModule } from 'ng-zorro-antd/avatar';
import { NzIconModule } from 'ng-zorro-antd/icon';
import { NzPaginationModule } from 'ng-zorro-antd/pagination'; 
import { NzButtonModule } from 'ng-zorro-antd/button'; 
import { NzFormModule } from 'ng-zorro-antd/form';
import { UpdateRoomComponent } from './components/update-room/update-room.component';
const routes: Routes = [
  { path: '', component: AdminComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'room', component: PostRoomComponent },    
  { path: 'room/:id/edit', component: UpdateRoomComponent }, 
];

@NgModule({
  declarations: [
    AdminComponent,
    DashboardComponent,
    PostRoomComponent  
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    NzCardModule,
    NzSkeletonModule,
    ReactiveFormsModule,
    NzAvatarModule,
    NzIconModule,
    NzPaginationModule,
    NzFormModule,
    NzButtonModule
  ]
})
export class AdminModule { }