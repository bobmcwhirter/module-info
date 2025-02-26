/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2018 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.moduleinfo;

import java.util.Set;

/**
 */
public class PackageNamePackageVisitor extends PackageVisitor {
    private final Set<String> packageNames;

    public PackageNamePackageVisitor(final PackageVisitor pv, final Set<String> packageNames) {
        super(pv);
        this.packageNames = packageNames;
    }

    public void visit(final String name) {
        packageNames.add(name);
        super.visit(name);
    }
}
