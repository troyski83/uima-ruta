/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.uima.ruta;

import org.apache.uima.ruta.condition.CurrentCountTest;
import org.apache.uima.ruta.condition.PartOfTest;
import org.apache.uima.ruta.condition.PositionTest;
import org.apache.uima.ruta.engine.HtmlAnnotatorTest;
import org.apache.uima.ruta.engine.HtmlConverterTest;
import org.apache.uima.ruta.engine.RutaModifierTest;
import org.apache.uima.ruta.seed.DefaultSeederTest;
import org.apache.uima.ruta.verbalizer.ActionVerbalizerTest;
import org.apache.uima.ruta.verbalizer.ConditionVerbalizerTest;
import org.apache.uima.ruta.verbalizer.ExpressionVerbalizerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DynamicAnchoringTest.class, DynamicAnchoringTest2.class, FilteringTest.class,
    IncompletePartitioningTest.class, LiteralStringMatchTest.class, LongGreedyTest.class,
    OutOfWindowTest.class, QuantifierTest1.class, QuantifierTest2.class, QuantifierTest3.class,
    QuantifierTest4.class, RuleInferenceTest.class, RuleInferenceTest2.class,
    RuleInferenceTest3.class, AllActionsTest.class, AllConditionsTest.class,
    CurrentCountTest.class, PartOfTest.class, PositionTest.class, DefaultSeederTest.class,
    ConditionVerbalizerTest.class, ActionVerbalizerTest.class, ExpressionVerbalizerTest.class,
    HtmlAnnotatorTest.class, HtmlConverterTest.class, EmptyDocumentTest.class,
    RutaModifierTest.class, RegExpRuleTest.class, WildCardTest.class, EqualShortNameTest.class })
public class AllTests {

}