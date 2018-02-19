// Generated from src/XPath.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XPathParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XPathParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_descendant}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_descendant(XPathParser.Ap_descendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_descendant}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_descendant(XPathParser.Ap_descendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_all(XPathParser.Ap_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_all(XPathParser.Ap_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_attName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_attName(XPathParser.Rp_attNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_attName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_attName(XPathParser.Rp_attNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dotdot(XPathParser.Rp_dotdotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dotdot(XPathParser.Rp_dotdotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_star(XPathParser.Rp_starContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_star(XPathParser.Rp_starContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dot(XPathParser.Rp_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dot(XPathParser.Rp_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(XPathParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(XPathParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_descendant}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_descendant(XPathParser.Rp_descendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_descendant}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_descendant(XPathParser.Rp_descendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_tagName(XPathParser.Rp_tagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_tagName(XPathParser.Rp_tagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_combine}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_combine(XPathParser.Rp_combineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_combine}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_combine(XPathParser.Rp_combineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_filter(XPathParser.Rp_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_filter(XPathParser.Rp_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_paren(XPathParser.Rp_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_paren(XPathParser.Rp_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_all}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_all(XPathParser.Rp_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_all}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_all(XPathParser.Rp_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(XPathParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(XPathParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(XPathParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(XPathParser.Filter_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_is(XPathParser.Filter_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_is(XPathParser.Filter_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_paren(XPathParser.Filter_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_paren(XPathParser.Filter_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_equal(XPathParser.Filter_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_equal(XPathParser.Filter_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(XPathParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(XPathParser.Filter_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(XPathParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(XPathParser.Filter_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_all}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_all(XPathParser.Xq_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_all}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_all(XPathParser.Xq_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_paren}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_paren(XPathParser.Xq_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_paren}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_paren(XPathParser.Xq_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_strConstant}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_strConstant(XPathParser.Xq_strConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_strConstant}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_strConstant(XPathParser.Xq_strConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_ap(XPathParser.Xq_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_ap(XPathParser.Xq_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_descendant}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_descendant(XPathParser.Xq_descendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_descendant}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_descendant(XPathParser.Xq_descendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_var(XPathParser.Xq_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_var(XPathParser.Xq_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_combine}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_combine(XPathParser.Xq_combineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_combine}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_combine(XPathParser.Xq_combineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_FLWR}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_FLWR(XPathParser.Xq_FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_FLWR}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_FLWR(XPathParser.Xq_FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_tag(XPathParser.Xq_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_tag(XPathParser.Xq_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_let(XPathParser.Xq_letContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_let(XPathParser.Xq_letContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_and(XPathParser.Cond_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_and(XPathParser.Cond_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_empty(XPathParser.Cond_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_empty(XPathParser.Cond_emptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_equal}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_equal(XPathParser.Cond_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_equal}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_equal(XPathParser.Cond_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_is(XPathParser.Cond_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_is(XPathParser.Cond_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_satisfy}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_satisfy(XPathParser.Cond_satisfyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_satisfy}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_satisfy(XPathParser.Cond_satisfyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_paren(XPathParser.Cond_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_paren(XPathParser.Cond_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_not(XPathParser.Cond_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_not(XPathParser.Cond_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_or(XPathParser.Cond_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_or(XPathParser.Cond_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(XPathParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(XPathParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XPathParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XPathParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(XPathParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(XPathParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#beginTag}.
	 * @param ctx the parse tree
	 */
	void enterBeginTag(XPathParser.BeginTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#beginTag}.
	 * @param ctx the parse tree
	 */
	void exitBeginTag(XPathParser.BeginTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(XPathParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(XPathParser.EndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XPathParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XPathParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XPathParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XPathParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XPathParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XPathParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XPathParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XPathParser.ReturnClauseContext ctx);
}