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
package fr.xebia.extras.selma.it.arrays;

/**
 * Created by slemesle on 25/11/2016.
 */
public class ArrayBeanSource {
    private BeanSource beans[];

    public ArrayBeanSource() {
    }

    public BeanSource[] getBeans() {
        return this.beans;
    }

    public void setBeans(BeanSource beans[]) {
        this.beans = beans;
    }
}
