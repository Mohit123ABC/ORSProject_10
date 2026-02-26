import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-placement-list',
  templateUrl: './placement-list.component.html',
  styleUrls: ['./placement-list.component.css']
})
export class PlacementListComponent  extends BaseListCtl {

   constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
      super(locator.endpoints.PLACEMENT, locator, route);
    }
}
