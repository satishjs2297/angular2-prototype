import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FdsComponent } from './fds.component';
import { FdsRoutingModule } from './fds-routing.module';
import { BreadcrumbModule, MenubarModule} from 'primeng/primeng';
import {TabMenuModule,MenuItem} from 'primeng/primeng';

@NgModule({
  imports: [CommonModule, FdsRoutingModule, BreadcrumbModule, MenubarModule, TabMenuModule],
  declarations: [FdsComponent],
  exports: [FdsComponent]
})
export class FdsModule { }
