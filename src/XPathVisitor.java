// Generated from src/XPath.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XPathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ap_descendant}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_descendant(XPathParser.Ap_descendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_all(XPathParser.Ap_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_attName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_attName(XPathParser.Rp_attNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dotdot(XPathParser.Rp_dotdotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_star(XPathParser.Rp_starContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dot(XPathParser.Rp_dotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_text(XPathParser.Rp_textContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_descendant}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_descendant(XPathParser.Rp_descendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_tagName(XPathParser.Rp_tagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_combine}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_combine(XPathParser.Rp_combineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_filter(XPathParser.Rp_filterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_paren(XPathParser.Rp_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_all}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_all(XPathParser.Rp_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_rp(XPathParser.Filter_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_and(XPathParser.Filter_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_is(XPathParser.Filter_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_paren(XPathParser.Filter_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_equal(XPathParser.Filter_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_or(XPathParser.Filter_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_not(XPathParser.Filter_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_all}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_all(XPathParser.Xq_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_paren}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_paren(XPathParser.Xq_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_strConstant}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_strConstant(XPathParser.Xq_strConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_ap(XPathParser.Xq_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_descendant}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_descendant(XPathParser.Xq_descendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_var(XPathParser.Xq_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_combine}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_combine(XPathParser.Xq_combineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_FLWR}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_FLWR(XPathParser.Xq_FLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_tag(XPathParser.Xq_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XPathParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_let(XPathParser.Xq_letContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_and(XPathParser.Cond_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_empty(XPathParser.Cond_emptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_equal}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_equal(XPathParser.Cond_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_is(XPathParser.Cond_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_satisfy}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_satisfy(XPathParser.Cond_satisfyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_paren(XPathParser.Cond_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_not(XPathParser.Cond_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XPathParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_or(XPathParser.Cond_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(XPathParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XPathParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(XPathParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#beginTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginTag(XPathParser.BeginTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTag(XPathParser.EndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XPathParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XPathParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XPathParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XPathParser.ReturnClauseContext ctx);
}