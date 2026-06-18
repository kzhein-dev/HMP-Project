import { Component } from '@angular/core';
import { NzMessageService } from 'ng-zorro-antd/message';
import { AdminService } from '../../admin-services/admin.service'; 
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent {

  currentPage = 1;
  rooms: any[] = [];
  total:any;
  loading = false;

  constructor(private adminService: AdminService,
              private message: NzMessageService) { 
    this.getRooms();
  }

  getRooms() {
    this.adminService.getRooms(this.currentPage - 1).subscribe(res => {
      console.log(res);
      this.rooms = res.roomDtoList;
      this.total = res.totalPages * 1;
    });
  }
  
  pageIndexChange(value: number) {
    this.currentPage = value;
    this.getRooms();
  }

}