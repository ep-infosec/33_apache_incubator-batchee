/*
 * Copyright 2012 International Business Machines Corp.
 * 
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.batchee.container.impl.controller;

import org.apache.batchee.container.impl.jobinstance.RuntimeJobExecution;
import org.apache.batchee.container.services.ServicesManager;

public class JobController extends JobThreadRootController {
    private JobController(final RuntimeJobExecution jobExecution, final long rootJobExecutionId, final ServicesManager manager) {
        super(jobExecution, rootJobExecutionId, manager);
    }

    public JobController(final RuntimeJobExecution jobExecution, final ServicesManager manager) {
        this(jobExecution, jobExecution.getExecutionId(), manager);
    }
}
