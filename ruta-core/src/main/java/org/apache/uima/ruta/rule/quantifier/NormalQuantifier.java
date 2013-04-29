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

package org.apache.uima.ruta.rule.quantifier;

import java.util.List;

import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.ruta.RutaBlock;
import org.apache.uima.ruta.RutaStatement;
import org.apache.uima.ruta.RutaStream;
import org.apache.uima.ruta.rule.ComposedRuleElementMatch;
import org.apache.uima.ruta.rule.RuleElement;
import org.apache.uima.ruta.rule.RuleElementMatch;
import org.apache.uima.ruta.rule.RuleMatch;
import org.apache.uima.ruta.visitor.InferenceCrowd;

public class NormalQuantifier implements RuleElementQuantifier {
  // @Override
  // public boolean continueMatch(int index, List<RuleElement> elements, RutaBasic next,
  // RuleElementMatch match, List<RuleElementMatch> matches, RutaStream stream,
  // InferenceCrowd crowd) {
  // return match == null;
  // }

  public List<RuleElementMatch> evaluateMatches(List<RuleElementMatch> matches,
          RutaStatement element, InferenceCrowd crowd) {
    if (matches == null) {
      return null;
    }
    boolean result = true;
    boolean allEmpty = true;
    for (RuleElementMatch match : matches) {
      result &= match.matched();
      allEmpty &= match.getTextsMatched().isEmpty();
    }
    result &= !allEmpty;
    if (result) {
      return matches;
    } else {
      return null;
    }
  }

  public boolean continueMatch(boolean after, AnnotationFS annotation, RuleElement ruleElement,
          RuleMatch extendedMatch, ComposedRuleElementMatch containerMatch,
          RutaStream stream, InferenceCrowd crowd) {
    List<RuleElementMatch> list = containerMatch.getInnerMatches().get(ruleElement);
    return list == null || list.isEmpty();
  }

  public boolean isOptional(RutaBlock parent) {
    return false;
  }
}