import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { GridComponent } from './grid.component';

@NgModule({
  imports: [
    RouterModule.forChild([
      { path: 'grid', component: GridComponent }
    ])
  ],
  exports: [RouterModule]
})
export class GridRoutingModule { }
