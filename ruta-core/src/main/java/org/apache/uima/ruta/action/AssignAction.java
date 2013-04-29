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

package org.apache.uima.ruta.action;

import org.apache.uima.cas.Type;
import org.apache.uima.ruta.RutaBlock;
import org.apache.uima.ruta.RutaEnvironment;
import org.apache.uima.ruta.RutaStream;
import org.apache.uima.ruta.expression.RutaExpression;
import org.apache.uima.ruta.expression.bool.BooleanExpression;
import org.apache.uima.ruta.expression.number.NumberExpression;
import org.apache.uima.ruta.expression.string.StringExpression;
import org.apache.uima.ruta.expression.type.TypeExpression;
import org.apache.uima.ruta.rule.RuleElement;
import org.apache.uima.ruta.rule.RuleMatch;
import org.apache.uima.ruta.visitor.InferenceCrowd;

public class AssignAction extends AbstractRutaAction {

  private String var;

  private RutaExpression expression;

  public AssignAction(String var, RutaExpression e) {
    super();
    this.var = var;
    this.expression = e;
  }

  @Override
  public void execute(RuleMatch match, RuleElement element, RutaStream stream,
          InferenceCrowd crowd) {
    RutaBlock parent = element.getParent();
    RutaEnvironment environment = parent.getEnvironment();
    Class<?> clazz = environment.getVariableType(var);
    if (clazz.equals(Integer.class) && expression instanceof NumberExpression) {
      int v = ((NumberExpression) expression).getIntegerValue(parent);
      environment.setVariableValue(var, v);
    } else if (clazz.equals(Double.class) && expression instanceof NumberExpression) {
      double v = ((NumberExpression) expression).getDoubleValue(parent);
      environment.setVariableValue(var, v);
    } else if (clazz.equals(Type.class) && expression instanceof TypeExpression) {
      Type v = ((TypeExpression) expression).getType(parent);
      environment.setVariableValue(var, v);
    } else if (clazz.equals(Boolean.class) && expression instanceof BooleanExpression) {
      boolean v = ((BooleanExpression) expression).getBooleanValue(parent);
      environment.setVariableValue(var, v);
    } else if (clazz.equals(String.class) && expression instanceof StringExpression) {
      String v = ((StringExpression) expression).getStringValue(parent);
      environment.setVariableValue(var, v);
    }
  }

  public String getVar() {
    return var;
  }

  public RutaExpression getExpression() {
    return expression;
  }

}
