package taylor.com.dsl

import android.content.Context
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import taylor.com.selector_kt.Selector
import taylor.com.views.LineFeedLayout


/**
 * layout dsl for customized view
 */
inline fun ViewGroup.LineFeedLayout(init: LineFeedLayout.() -> Unit) =
    LineFeedLayout(context).apply(init).also { addView(it) }

inline fun Context.LineFeedLayout(init: LineFeedLayout.() -> Unit): LineFeedLayout =
    LineFeedLayout(this).apply(init)

inline fun Fragment.LineFeedLayout(init: LineFeedLayout.() -> Unit) =
    context?.let { LineFeedLayout(it).apply(init) }

inline fun ViewGroup.Selector(init: Selector.() -> Unit) =
    Selector(context).apply(init).also { addView(it) }

inline fun Context.Selector(init: Selector.() -> Unit): Selector =
    Selector(this).apply(init)

inline fun Fragment.Selector(init: Selector.() -> Unit) =
    context?.let { Selector(it).apply(init) }