import {NgModule}      from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule}    from '@angular/http';
import { CommonModule } from '@angular/common';
import {BrowserModule} from '@angular/platform-browser';
import {GridRoutingModule} from './grid-routing.module';
import 'rxjs/add/operator/toPromise';

import {GridComponent}  from './grid.component';
import {GridService} from './gridservice';
import {InputTextModule,DataTableModule,ButtonModule,MultiSelectModule,DialogModule,SliderModule,DropdownModule} from 'primeng/primeng';

@NgModule({
  imports:      [GridRoutingModule,MultiSelectModule,CommonModule,BrowserModule,FormsModule,HttpModule,DropdownModule,SliderModule,InputTextModule,DataTableModule,ButtonModule,DialogModule],
  declarations: [GridComponent],
  providers:    [GridService]
})
export class GridModule { }
