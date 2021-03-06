/*
 * Copyright 2013  Séven Le Mesle
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
 * 
 */
package fr.xebia.extras.selma;

/**
 * Created by slemesle on 27/11/14.
 */
public enum IgnoreMissing {
    /**
     * Ignore fields appearing in destination and missing in source bean.
     */
    SOURCE(true, false),

    /**
     * Ignore fields appearing in source and missing in destination bean.
     */
    DESTINATION(false, true),

    /**
     * Ignore all missing fields from source and destination bean
     */
    ALL(true, true),

    /**
     * Report all missing fields from source and destination bean
     */
    NONE(false, false),

    /**
     * If setted on {@link @Maps} then {@link @Mapper} setting is applied otherwise {@code NONE} is applied.
     */
    DEFAULT(false, false);

    private final boolean ignoreSource;
    private final boolean ignoreDestination;

    IgnoreMissing(boolean ignoreSource, boolean ignoreDestination) {

        this.ignoreSource = ignoreSource;
        this.ignoreDestination = ignoreDestination;
    }

    public boolean isIgnoreSource() {
        return ignoreSource;
    }

    public boolean isIgnoreDestination() {
        return ignoreDestination;
    }
}
