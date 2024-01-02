package com.language.custom.ast;

public class BinaryExpressionNode extends ExpressionNode {
    private ExpressionNode leftOperand;
    private ExpressionNode rightOperand;
    private String operator;

    public BinaryExpressionNode(ExpressionNode leftOperand, ExpressionNode rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }
    
}
