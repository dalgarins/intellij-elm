// This is a generated file. Not intended for manual editing.
package org.elm.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import org.elm.lang.core.stubs.StubImplementationsKt;

public interface ElmTypes {

  IElementType ANONYMOUS_FUNCTION_EXPR = new ElmElementType("ANONYMOUS_FUNCTION_EXPR");
  IElementType ANYTHING_PATTERN = new ElmElementType("ANYTHING_PATTERN");
  IElementType AS_CLAUSE = StubImplementationsKt.factory("AS_CLAUSE");
  IElementType BIN_OP_EXPR = new ElmElementType("BIN_OP_EXPR");
  IElementType CASE_OF_BRANCH = new ElmElementType("CASE_OF_BRANCH");
  IElementType CASE_OF_EXPR = new ElmElementType("CASE_OF_EXPR");
  IElementType CHAR_CONSTANT_EXPR = new ElmElementType("CHAR_CONSTANT_EXPR");
  IElementType CONS_PATTERN = new ElmElementType("CONS_PATTERN");
  IElementType EXPOSED_OPERATOR = StubImplementationsKt.factory("EXPOSED_OPERATOR");
  IElementType EXPOSED_TYPE = StubImplementationsKt.factory("EXPOSED_TYPE");
  IElementType EXPOSED_VALUE = StubImplementationsKt.factory("EXPOSED_VALUE");
  IElementType EXPOSING_LIST = StubImplementationsKt.factory("EXPOSING_LIST");
  IElementType EXPRESSION = new ElmElementType("EXPRESSION");
  IElementType FIELD = new ElmElementType("FIELD");
  IElementType FIELD_ACCESSOR_FUNCTION_EXPR = new ElmElementType("FIELD_ACCESSOR_FUNCTION_EXPR");
  IElementType FIELD_ACCESS_EXPR = new ElmElementType("FIELD_ACCESS_EXPR");
  IElementType FIELD_TYPE = StubImplementationsKt.factory("FIELD_TYPE");
  IElementType FUNCTION_CALL_EXPR = new ElmElementType("FUNCTION_CALL_EXPR");
  IElementType FUNCTION_DECLARATION_LEFT = StubImplementationsKt.factory("FUNCTION_DECLARATION_LEFT");
  IElementType GLSL_CODE_EXPR = new ElmElementType("GLSL_CODE_EXPR");
  IElementType IF_ELSE_EXPR = new ElmElementType("IF_ELSE_EXPR");
  IElementType IMPORT_CLAUSE = StubImplementationsKt.factory("IMPORT_CLAUSE");
  IElementType INFIX_DECLARATION = StubImplementationsKt.factory("INFIX_DECLARATION");
  IElementType INFIX_FUNC_REF = StubImplementationsKt.factory("INFIX_FUNC_REF");
  IElementType LET_IN_EXPR = new ElmElementType("LET_IN_EXPR");
  IElementType LIST_EXPR = new ElmElementType("LIST_EXPR");
  IElementType LIST_PATTERN = new ElmElementType("LIST_PATTERN");
  IElementType LOWER_PATTERN = new ElmElementType("LOWER_PATTERN");
  IElementType LOWER_TYPE_NAME = StubImplementationsKt.factory("LOWER_TYPE_NAME");
  IElementType MODULE_DECLARATION = StubImplementationsKt.factory("MODULE_DECLARATION");
  IElementType NEGATE_EXPR = new ElmElementType("NEGATE_EXPR");
  IElementType NULLARY_CONSTRUCTOR_ARGUMENT_PATTERN = new ElmElementType("NULLARY_CONSTRUCTOR_ARGUMENT_PATTERN");
  IElementType NUMBER_CONSTANT_EXPR = new ElmElementType("NUMBER_CONSTANT_EXPR");
  IElementType OPERATOR = new ElmElementType("OPERATOR");
  IElementType OPERATOR_AS_FUNCTION_EXPR = new ElmElementType("OPERATOR_AS_FUNCTION_EXPR");
  IElementType PARENTHESIZED_EXPR = new ElmElementType("PARENTHESIZED_EXPR");
  IElementType PATTERN = new ElmElementType("PATTERN");
  IElementType PORT_ANNOTATION = StubImplementationsKt.factory("PORT_ANNOTATION");
  IElementType RECORD_BASE_IDENTIFIER = StubImplementationsKt.factory("RECORD_BASE_IDENTIFIER");
  IElementType RECORD_EXPR = new ElmElementType("RECORD_EXPR");
  IElementType RECORD_PATTERN = new ElmElementType("RECORD_PATTERN");
  IElementType RECORD_TYPE = StubImplementationsKt.factory("RECORD_TYPE");
  IElementType STRING_CONSTANT_EXPR = new ElmElementType("STRING_CONSTANT_EXPR");
  IElementType TUPLE_EXPR = new ElmElementType("TUPLE_EXPR");
  IElementType TUPLE_PATTERN = new ElmElementType("TUPLE_PATTERN");
  IElementType TUPLE_TYPE = StubImplementationsKt.factory("TUPLE_TYPE");
  IElementType TYPE_ALIAS_DECLARATION = StubImplementationsKt.factory("TYPE_ALIAS_DECLARATION");
  IElementType TYPE_ANNOTATION = StubImplementationsKt.factory("TYPE_ANNOTATION");
  IElementType TYPE_DECLARATION = StubImplementationsKt.factory("TYPE_DECLARATION");
  IElementType TYPE_EXPRESSION = StubImplementationsKt.factory("TYPE_EXPRESSION");
  IElementType TYPE_REF = StubImplementationsKt.factory("TYPE_REF");
  IElementType TYPE_VARIABLE = StubImplementationsKt.factory("TYPE_VARIABLE");
  IElementType UNION_PATTERN = new ElmElementType("UNION_PATTERN");
  IElementType UNION_VARIANT = StubImplementationsKt.factory("UNION_VARIANT");
  IElementType UNIT_EXPR = StubImplementationsKt.factory("UNIT_EXPR");
  IElementType UPPER_CASE_QID = StubImplementationsKt.factory("UPPER_CASE_QID");
  IElementType VALUE_DECLARATION = StubImplementationsKt.factory("VALUE_DECLARATION");
  IElementType VALUE_EXPR = new ElmElementType("VALUE_EXPR");
  IElementType VALUE_QID = new ElmElementType("VALUE_QID");

  IElementType ALIAS = new ElmTokenType("ALIAS");
  IElementType ARROW = new ElmTokenType("ARROW");
  IElementType AS = new ElmTokenType("AS");
  IElementType BACKSLASH = new ElmTokenType("BACKSLASH");
  IElementType BLOCK_COMMENT = new ElmTokenType("BLOCK_COMMENT");
  IElementType CASE = new ElmTokenType("CASE");
  IElementType CLOSE_CHAR = new ElmTokenType("CLOSE_CHAR");
  IElementType CLOSE_QUOTE = new ElmTokenType("CLOSE_QUOTE");
  IElementType COLON = new ElmTokenType("COLON");
  IElementType COMMA = new ElmTokenType("COMMA");
  IElementType DOC_COMMENT = new ElmTokenType("DOC_COMMENT");
  IElementType DOT = new ElmTokenType("DOT");
  IElementType DOUBLE_DOT = new ElmTokenType("DOUBLE_DOT");
  IElementType ELSE = new ElmTokenType("ELSE");
  IElementType END_GLSL_CODE = new ElmTokenType("END_GLSL_CODE");
  IElementType EQ = new ElmTokenType("EQ");
  IElementType EXPOSING = new ElmTokenType("EXPOSING");
  IElementType GLSL_CODE_CONTENT = new ElmTokenType("GLSL_CODE_CONTENT");
  IElementType IF = new ElmTokenType("IF");
  IElementType IMPORT = new ElmTokenType("IMPORT");
  IElementType IN = new ElmTokenType("IN");
  IElementType INFIX = new ElmTokenType("INFIX");
  IElementType INVALID_STRING_ESCAPE = new ElmTokenType("INVALID_STRING_ESCAPE");
  IElementType LEFT_BRACE = new ElmTokenType("LEFT_BRACE");
  IElementType LEFT_PARENTHESIS = new ElmTokenType("LEFT_PARENTHESIS");
  IElementType LEFT_SQUARE_BRACKET = new ElmTokenType("LEFT_SQUARE_BRACKET");
  IElementType LET = new ElmTokenType("LET");
  IElementType LINE_COMMENT = new ElmTokenType("LINE_COMMENT");
  IElementType LOWER_CASE_IDENTIFIER = new ElmTokenType("LOWER_CASE_IDENTIFIER");
  IElementType MODULE = new ElmTokenType("MODULE");
  IElementType NEWLINE = new ElmTokenType("NEWLINE");
  IElementType NUMBER_LITERAL = new ElmTokenType("NUMBER_LITERAL");
  IElementType OF = new ElmTokenType("OF");
  IElementType OPEN_CHAR = new ElmTokenType("OPEN_CHAR");
  IElementType OPEN_QUOTE = new ElmTokenType("OPEN_QUOTE");
  IElementType OPERATOR_IDENTIFIER = new ElmTokenType("OPERATOR_IDENTIFIER");
  IElementType PIPE = new ElmTokenType("PIPE");
  IElementType PORT = new ElmTokenType("PORT");
  IElementType REGULAR_STRING_PART = new ElmTokenType("REGULAR_STRING_PART");
  IElementType RESERVED = new ElmTokenType("RESERVED");
  IElementType RIGHT_BRACE = new ElmTokenType("RIGHT_BRACE");
  IElementType RIGHT_PARENTHESIS = new ElmTokenType("RIGHT_PARENTHESIS");
  IElementType RIGHT_SQUARE_BRACKET = new ElmTokenType("RIGHT_SQUARE_BRACKET");
  IElementType START_GLSL_CODE = new ElmTokenType("START_GLSL_CODE");
  IElementType STRING_ESCAPE = new ElmTokenType("STRING_ESCAPE");
  IElementType TAB = new ElmTokenType("TAB");
  IElementType THEN = new ElmTokenType("THEN");
  IElementType TYPE = new ElmTokenType("TYPE");
  IElementType UNDERSCORE = new ElmTokenType("UNDERSCORE");
  IElementType UPPER_CASE_IDENTIFIER = new ElmTokenType("UPPER_CASE_IDENTIFIER");
  IElementType VIRTUAL_END_DECL = new ElmTokenType("VIRTUAL_END_DECL");
  IElementType VIRTUAL_END_SECTION = new ElmTokenType("VIRTUAL_END_SECTION");
  IElementType VIRTUAL_OPEN_SECTION = new ElmTokenType("VIRTUAL_OPEN_SECTION");
  IElementType WHERE = new ElmTokenType("WHERE");
}