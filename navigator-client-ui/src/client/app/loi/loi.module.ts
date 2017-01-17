import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoiComponent } from './loi.component';
import { LoiRoutingModule } from './loi-routing.module';
import {MessagesModule,ButtonModule} from 'primeng/primeng';

@NgModule({
  imports: [CommonModule, LoiRoutingModule, MessagesModule,ButtonModule],
  declarations: [LoiComponent],
  exports: [LoiComponent]
})
export class LoiModule { }
