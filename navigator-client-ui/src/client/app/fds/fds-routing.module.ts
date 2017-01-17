import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FdsComponent } from './fds.component';

@NgModule({
  imports: [
    RouterModule.forChild([
      { path: 'fds', component: FdsComponent }
    ])
  ],
  exports: [RouterModule]
})
export class FdsRoutingModule { }
