/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */
package org.danielnixon.saferdom.raw

import scala.scalajs.js

/**
 * A CSSStyleDeclaration is an interface to the declaration block returned by the
 * style property of a cssRule in a stylesheet, when the rule is a CSSStyleRule.
 *
 * MDN
 */
@js.native
class CSSStyleDeclaration extends js.Object {
  var backgroundAttachment: String = js.native
  var visibility: String = js.native
  var textAlignLast: String = js.native
  var borderRightStyle: String = js.native
  var counterIncrement: String = js.native
  var orphans: String = js.native
  var cssText: String = js.native
  var borderStyle: String = js.native
  var pointerEvents: String = js.native
  var borderTopColor: String = js.native
  var markerEnd: String = js.native
  var textIndent: String = js.native
  var listStyleImage: String = js.native
  var cursor: String = js.native
  var listStylePosition: String = js.native
  var wordWrap: String = js.native
  var borderTopStyle: String = js.native
  var alignmentBaseline: String = js.native
  var opacity: String = js.native
  var direction: String = js.native
  var strokeMiterlimit: String = js.native
  var maxWidth: String = js.native
  var color: String = js.native
  var clip: String = js.native
  var borderRightWidth: String = js.native
  var verticalAlign: String = js.native
  var overflow: String = js.native
  var mask: String = js.native
  var borderLeftStyle: String = js.native
  var emptyCells: String = js.native
  var stopOpacity: String = js.native
  var paddingRight: String = js.native

  // TODO: Read-only. Push upstream. https://drafts.csswg.org/cssom/#the-cssstyledeclaration-interface
  private[saferdom] def parentRule: CSSRule = js.native

  var background: String = js.native
  var boxSizing: String = js.native
  var textJustify: String = js.native
  var height: String = js.native
  var paddingTop: String = js.native
  var length: Int = js.native
  var right: String = js.native
  var baselineShift: String = js.native
  var borderLeft: String = js.native
  var widows: String = js.native
  var lineHeight: String = js.native
  var left: String = js.native
  var textUnderlinePosition: String = js.native
  var glyphOrientationHorizontal: String = js.native
  var display: String = js.native
  var textAnchor: String = js.native
  var cssFloat: String = js.native
  var strokeDasharray: String = js.native
  var rubyAlign: String = js.native
  var fontSizeAdjust: String = js.native
  var borderLeftColor: String = js.native
  var backgroundImage: String = js.native
  var listStyleType: String = js.native
  var strokeWidth: String = js.native
  var textOverflow: String = js.native
  var fillRule: String = js.native
  var borderBottomColor: String = js.native
  var zIndex: String = js.native
  var position: String = js.native
  var listStyle: String = js.native
  var dominantBaseline: String = js.native
  var overflowY: String = js.native
  var fill: String = js.native
  var captionSide: String = js.native
  var borderCollapse: String = js.native
  var boxShadow: String = js.native
  var quotes: String = js.native
  var tableLayout: String = js.native
  var unicodeBidi: String = js.native
  var borderBottomWidth: String = js.native
  var backgroundSize: String = js.native
  var textDecoration: String = js.native
  var strokeDashoffset: String = js.native
  var fontSize: String = js.native
  var border: String = js.native
  var pageBreakBefore: String = js.native
  var borderTopRightRadius: String = js.native
  var borderBottomLeftRadius: String = js.native
  var textTransform: String = js.native
  var rubyPosition: String = js.native
  var strokeLinejoin: String = js.native
  var clipPath: String = js.native
  var borderRightColor: String = js.native
  var fontFamily: String = js.native
  var clear: String = js.native
  var content: String = js.native
  var backgroundClip: String = js.native
  var marginBottom: String = js.native
  var counterReset: String = js.native
  var outlineWidth: String = js.native
  var marginRight: String = js.native
  var paddingLeft: String = js.native
  var borderBottom: String = js.native
  var wordBreak: String = js.native
  var marginTop: String = js.native
  var top: String = js.native
  var fontWeight: String = js.native
  var borderRight: String = js.native
  var width: String = js.native
  var kerning: String = js.native
  var pageBreakAfter: String = js.native
  var borderBottomStyle: String = js.native
  var fontStretch: String = js.native
  var padding: String = js.native
  var strokeOpacity: String = js.native
  var markerStart: String = js.native
  var bottom: String = js.native
  var borderLeftWidth: String = js.native
  var clipRule: String = js.native
  var backgroundPosition: String = js.native
  var backgroundColor: String = js.native
  var pageBreakInside: String = js.native
  var backgroundOrigin: String = js.native
  var strokeLinecap: String = js.native
  var borderTopWidth: String = js.native
  var outlineStyle: String = js.native
  var borderTop: String = js.native
  var outlineColor: String = js.native
  var paddingBottom: String = js.native
  var marginLeft: String = js.native
  var font: String = js.native
  var outline: String = js.native
  var wordSpacing: String = js.native
  var maxHeight: String = js.native
  var fillOpacity: String = js.native
  var letterSpacing: String = js.native
  var borderSpacing: String = js.native
  var backgroundRepeat: String = js.native
  var borderRadius: String = js.native
  var borderWidth: String = js.native
  var borderBottomRightRadius: String = js.native
  var whiteSpace: String = js.native
  var fontStyle: String = js.native
  var minWidth: String = js.native
  var stopColor: String = js.native
  var borderTopLeftRadius: String = js.native
  var borderColor: String = js.native
  var marker: String = js.native
  var glyphOrientationVertical: String = js.native
  var markerMid: String = js.native
  var fontVariant: String = js.native
  var minHeight: String = js.native
  var stroke: String = js.native
  var rubyOverhang: String = js.native
  var overflowX: String = js.native
  var textAlign: String = js.native
  var margin: String = js.native

  def getPropertyPriority(propertyName: String): String = js.native

  def getPropertyValue(propertyName: String): String = js.native

  def removeProperty(propertyName: String): String = js.native

  def item(index: Int): String = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): String = js.native

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: String): Unit = js.native

  def setProperty(propertyName: String, value: String,
      priority: String = js.native): Unit = js.native

  var animationFillMode: String = js.native
  var floodColor: String = js.native
  var animationIterationCount: String = js.native
  var textShadow: String = js.native
  var backfaceVisibility: String = js.native
  var animationDelay: String = js.native
  var animationTimingFunction: String = js.native
  var columnWidth: js.Any = js.native
  var columnRuleColor: js.Any = js.native
  var columnRuleWidth: js.Any = js.native
  var transitionDelay: String = js.native
  var transition: String = js.native
  var enableBackground: String = js.native
  var columnRuleStyle: String = js.native
  var animation: String = js.native
  var transform: String = js.native
  var colorInterpolationFilters: String = js.native
  var transitionTimingFunction: String = js.native
  var animationPlayState: String = js.native
  var transformOrigin: String = js.native
  var columnGap: js.Any = js.native
  var transitionProperty: String = js.native
  var fontFeatureSettings: String = js.native
  var breakBefore: String = js.native
  var perspective: String = js.native
  var animationDirection: String = js.native
  var animationDuration: String = js.native
  var animationName: String = js.native
  var columnRule: String = js.native
  var columnFill: String = js.native
  var perspectiveOrigin: String = js.native
  var lightingColor: String = js.native
  var columns: String = js.native
  var floodOpacity: String = js.native
  var columnSpan: String = js.native
  var breakInside: String = js.native
  var transitionDuration: String = js.native
  var breakAfter: String = js.native
  var columnCount: js.Any = js.native
  var transformStyle: String = js.native
}

/**
 * An object implementing the CSSStyleSheet interface represents a single CSS style
 * sheet.
 *
 * MDN
 */
@js.native
class CSSStyleSheet extends StyleSheet {
  // TODO: Lots of this needs to be deprecated upstream.
  // See https://drafts.csswg.org/cssom/#cssstylesheet
  // See https://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSStyleSheet

  // TODO: Read-only. Push upstream. https://drafts.csswg.org/cssom/#the-cssstylesheet-interface
  /**
   * If this style sheet is imported into the document using an `@import` rule, the
   * ownerRule property will return that CSSImportRule, otherwise it returns null.
   *
   * MDN
   */
  private[saferdom] def ownerRule: CSSRule = js.native

  /**
   * Returns a CSSRuleList of the CSS rules in the style sheet.
   *
   * MDN
   */
  def cssRules: CSSRuleList = js.native

  /**
   * The CSSStyleSheet.insertRule() method inserts a new style rule into the current
   * style sheet.
   *
   * MDN
   */
  def insertRule(rule: String, index: Int = js.native): Int = js.native

  /**
   * Deletes a rule from the style sheet.
   *
   * MDN
   */
  def deleteRule(index: Int = js.native): Unit = js.native
}

/**
 * CSSStyleRule represents a single CSS style rule. It implements the CSSRule
 * interface with a type value of 1 (CSSRule.STYLE_RULE).
 *
 * MDN
 */
@js.native
class CSSStyleRule extends CSSRule {

  /**
   * Gets/sets the textual representation of the selector for this rule, e.g. "h1,h2".
   *
   * MDN
   */
  var selectorText: String = js.native

  // TODO: Push upstream. See https://drafts.csswg.org/cssom/#the-cssstylerule-interface
  /**
    * Returns the CSSStyleDeclaration object for the rule. Read only.
    *
    * MDN
    */
  def style: CSSStyleDeclaration = js.native
}

/**
 * CSSMediaRule is an object representing a single CSS `@media` rule. It implements the
 * CSSConditionRule interface, and therefore the CSSGroupingRule and the CSSRule
 * interface with a type value of 4 (CSSRule.MEDIA_RULE).
 *
 * MDN
 */
@js.native
class CSSMediaRule extends CSSRule {

  // TODO: Should be read-only. Push upstream. https://drafts.csswg.org/cssom/#the-cssmediarule-interface
  /**
   * Specifies a MediaList representing the intended destination medium for style
   * information.
   *
   * MDN
   */
  def media: MediaList = js.native

  // TODO: Everything below belongs on a CSSGroupingRule interface. https://drafts.csswg.org/cssom/#cssgroupingrule

  // TODO: Should be read-only. Push upstream. https://drafts.csswg.org/cssom/#cssgroupingrule
  def cssRules: CSSRuleList = js.native

  // TODO: Should index have default value? https://drafts.csswg.org/cssom/#cssgroupingrule
  def insertRule(rule: String, index: Int = js.native): Int = js.native

  // TODO: Should index have default value? https://drafts.csswg.org/cssom/#cssgroupingrule
  def deleteRule(index: Int = js.native): Unit = js.native
}

/**
 * The CSSNamespaceRule interface describes an object representing a single CSS
 * `@@namespace` at-rule. It implements the CSSRule interface, with a type value of 10
 * (CSSRule.NAMESPACE_RULE).
 *
 * MDN
 */
@js.native
class CSSNamespaceRule extends CSSRule {

  // TODO: both of these are read-only. Push upstream. https://drafts.csswg.org/cssom/#the-cssnamespacerule-interface
  /**
   * Returns a DOMString containing the text of the URI of the given namespace.
   *
   * MDN
   */
  def namespaceURI: String = js.native

  /**
   * Returns a DOMString with the name of the prefix associated to this namespace. If
   * there is no such prefix, returns null.
   *
   * MDN
   */
  def prefix: String = js.native
}

@js.native
class CSSImportRule extends CSSRule {
  // TODO: All three of these are read-only. Push upstream. https://drafts.csswg.org/cssom/#the-cssimportrule-interface
  def styleSheet: CSSStyleSheet = js.native
  def href: String = js.native
  def media: MediaList = js.native
}

/**
 * An object implementing the CSSRule DOM interface represents a single CSS at-rule.
 * References to a CSSRule-implementing object may be obtained by looking at a CSS
 * style sheet's cssRules list.
 *
 * MDN
 */
@js.native
class CSSRule extends js.Object {

  /**
   * cssText returns the actual text of the style rule. To be able to set a stylesheet rule
   * dynamically, see Using dynamic styling information.
   *
   * MDN
   */
  var cssText: String = js.native

  // TODO: Read-only. Push upstream. https://drafts.csswg.org/cssom/#cssrule
  /**
   * parentStyleSheet returns the stylesheet object in which the current rule is
   * defined.
   *
   * MDN
   */
  private[saferdom] def parentStyleSheet: CSSStyleSheet = js.native

  // TODO: Read-only. Push upstream. https://drafts.csswg.org/cssom/#cssrule
  /**
   * Returns the containing rule, otherwise null. E.g. if this rule is a style rule
   * inside an `@media` block, the parent rule would be that CSSMediaRule.
   *
   * MDN
   */
  private[saferdom] def parentRule: CSSRule = js.native

  // TODO: Read-only. Push upstream. https://drafts.csswg.org/cssom/#cssrule
  def `type`: Int = js.native

  var IMPORT_RULE: Int = js.native
  var MEDIA_RULE: Int = js.native
  var STYLE_RULE: Int = js.native
  var NAMESPACE_RULE: Int = js.native
  var PAGE_RULE: Int = js.native
  var UNKNOWN_RULE: Int = js.native
  var FONT_FACE_RULE: Int = js.native
  var CHARSET_RULE: Int = js.native
  var KEYFRAMES_RULE: Int = js.native
  var KEYFRAME_RULE: Int = js.native
  var VIEWPORT_RULE: Int = js.native
}

@js.native
object CSSRule extends js.Object {
  var IMPORT_RULE: Int = js.native
  var MEDIA_RULE: Int = js.native
  var STYLE_RULE: Int = js.native
  var NAMESPACE_RULE: Int = js.native
  var PAGE_RULE: Int = js.native
  var UNKNOWN_RULE: Int = js.native
  var FONT_FACE_RULE: Int = js.native
  var CHARSET_RULE: Int = js.native
}

@js.native
class CSSFontFaceRule extends CSSRule {
  // TODO: Read-only?
  var style: CSSStyleDeclaration = js.native
}

/**
 * CSSPageRule is an object representing a single CSS `@page` rule. It implements the
 * CSSRule interface with a type value of 6 (CSSRule.PAGE_RULE).
 *
 * MDN
 */
@js.native
class CSSPageRule extends CSSRule {
  // TODO: Should this exist? https://drafts.csswg.org/cssom/#the-csspagerule-interface
  var pseudoClass: String = js.native

  /**
   * Represents the text of the page selector associated with the at-rule.
   *
   * MDN
   */
  var selectorText: String = js.native

  // TODO: Should this exist? https://drafts.csswg.org/cssom/#the-csspagerule-interface
  var selector: String = js.native

  // TODO: Read-only. Push upstream. https://drafts.csswg.org/cssom/#the-csspagerule-interface
  /**
   * Returns the declaration block associated with the at-rule.
   *
   * MDN
   */
  def style: CSSStyleDeclaration = js.native
}

/**
 * A CSSRuleList is an array-like object containing an ordered collection of CSSRule
 * objects.
 *
 * MDN
 */
@js.native
class CSSRuleList extends DOMList[CSSRule]

/**
 * The CSSKeyframesRule interface describes an object representing a complete set
 * of keyframes for a CSS animation. It corresponds to the contains of a whole
 * `@@keyframes` at-rule. It implements the CSSRule interface with a type value of 7
 * (CSSRule.KEYFRAMES_RULE).
 *
 * MDN
 */
@js.native
class CSSKeyframesRule extends CSSRule {

  /**
   * Represents the name of the animation, used by the animation-name property.
   *
   * MDN
   */
  var name: String = js.native

  // TODO: Read-only. Push upstream. https://drafts.csswg.org/css-animations/#interface-csskeyframesrule
  /**
   * Returns a CSSRuleList of the CSS rules in the media rule.
   *
   * MDN
   */
  def cssRules: CSSRuleList = js.native

  /**
   * Returns a keyframe rule corresponding to the given key. The key is a DOMString
   * containing an index of the keyframe o be returned, resolving to a number between 0
   * and 1. If no such keyframe exists, findRule returns null.
   *
   * MDN
   */
  private[saferdom] def findRule(rule: String): CSSKeyframeRule = js.native

  /**
   * Deletes a keyframe rule from the current CSSKeyframesRule. The parameter is the
   * index of the keyframe to be deleted, expressed as a DOMString resolving as a number
   * between 0 and 1.
   *
   * MDN
   */
  def deleteRule(rule: String): Unit = js.native

  /**
   * Inserts a new keyframe rule into the current CSSKeyframesRule. The parameter is a
   * DOMString containing a keyframe in the same format as an entry of a `@keyframes`
   * at-rule. If it contains more than one keyframe rule, a DOMException with a
   * SYNTAX_ERR is thrown.
   *
   * MDN
   */
  def appendRule(rule: String): Unit = js.native
}

/**
 * The CSSKeyframeRule interface describes an object representing a set of style for
 * a given keyframe. It corresponds to the contains of a single keyframe of a
 * `@@keyframes` at-rule. It implements the CSSRule interface with a type value of 8
 * (CSSRule.KEYFRAME_RULE).
 *
 * MDN
 */
@js.native
class CSSKeyframeRule extends CSSRule {

  /**
   * Represents the key of the keyframe, like '10%', '75%'. The from keyword maps to '0%'
   * and the to keyword maps to '100%'.
   *
   * MDN
   */
  var keyText: String = js.native

  // TODO: Read-only. Push upstream. https://drafts.csswg.org/css-animations/#interface-csskeyframerule-idl
  /**
   * Returns a CSSStyleDeclaration of the CSS style associated with the keyfrom.
   *
   * MDN
   */
  def style: CSSStyleDeclaration = js.native
}
