/*
 * Copyright (C) 2012 Clayton Harbour
 * 
 * This file is part of PocketAdmin
 *
 * PocketAdmin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PocketAdmin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PocketAdmin.  If not, see <http://www.gnu.org/licenses/>.*
 */

package com.westcliffarms.pocketadmin;

import java.util.List;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

import roboguice.application.RoboApplication;

import com.google.inject.Module;

@ReportsCrashes(formKey="dDFPZ3VQQ2FISUIwYzVrby0xVDdyVVE6MQ")
public class PocketAdmin extends RoboApplication {

	protected void addApplicationModules(List<Module> modules) {
		modules.add(new PocketAdminModule());		
    }
	
	@Override
	public void onCreate() {
        ACRA.init(this);
        super.onCreate();
	}
	
}
