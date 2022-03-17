/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** reply-all */
object FA_REPLY_ALL: Icon {
	
	override val name get() = "reply-all"
	
	override val unicode get() = "f122"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M136.3 226.2l176 151.1c15.38 13.3 39.69 2.545 39.69-18.16V275.1c108.5 12.58 151.1 58.79 112.6 181.9c-5.031 16.09 14.41 28.56 28.06 18.62c43.75-31.81 83.34-92.69 83.34-154.1c0-131.3-94.86-173.2-224-183.5V56.02c0-20.67-24.28-31.46-39.69-18.16L136.3 189.9C125.2 199.4 125.2 216.6 136.3 226.2zM8.31 226.2l176 151.1c15.38 13.3 39.69 2.545 39.69-18.16v-15.83L66.33 208l157.7-136.2V56.02c0-20.67-24.28-31.46-39.69-18.16l-176 151.1C-2.77 199.4-2.77 216.6 8.31 226.2z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_REPLY_ALL]. */
val FA_MAIL_REPLY_ALL = FA_REPLY_ALL
