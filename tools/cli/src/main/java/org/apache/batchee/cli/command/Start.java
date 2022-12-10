/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.batchee.cli.command;

import org.apache.batchee.cli.command.api.Command;
import org.apache.batchee.cli.command.api.Option;

import javax.batch.operations.JobOperator;

@Command(name = "start", description = "start a batch")
public class Start extends StartableCommand {
    @Option(name = "name", description = "name of the batch to start", required = true)
    private String name;

    @Override
    protected long doStart(final JobOperator operator) {
        final long id = operator.start(name, toProperties(properties));
        info("Batch '" + name + "' started with id #" + id);
        return id;
    }
}
