import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { LoiComponent } from './loi.component';

@NgModule({
  imports: [
    RouterModule.forChild([
      { path: 'loi', component: LoiComponent }
    ])
  ],
  exports: [RouterModule]
})
export class LoiRoutingModule { }
