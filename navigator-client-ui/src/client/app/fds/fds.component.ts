import { Component, OnInit } from '@angular/core';

/**
 * This class represents the lazy loaded AboutComponent.
 */
@Component({
  moduleId: module.id,
  selector: 'sd-fds',
  templateUrl: 'fds.component.html'
})

export class FdsComponent implements OnInit {

    private bcitems: MenuItem[];
    private menubaritems: MenuItem[];
    
    ngOnInit() {
        this.bcitems = [];
        this.bcitems.push({label:'Form'});
        this.bcitems.push({label:'Module'});
        this.bcitems.push({label:'Question'});
        this.bcitems.push({label:'References'});
        this.bcitems.push({label:'Links', url: 'https://google.com'});

        this.menubaritems = [
            {label: 'Stats', icon: 'fa-bar-chart'},
            {label: 'Calendar', icon: 'fa-calendar'},
            {label: 'Documentation', icon: 'fa-book'},
            {label: 'Support', icon: 'fa-support'},
            {label: 'Social', icon: 'fa-twitter'}
        ];
    }
}