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

/** Square share nodes */
object FA_SQUARE_SHARE_NODES: Icon {
	
	override val name get() = "Square share nodes"
	
	override val unicode get() = "f1e1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384 32C419.3 32 448 60.65 448 96V416C448 451.3 419.3 480 384 480H64C28.65 480 0 451.3 0 416V96C0 60.65 28.65 32 64 32H384zM320 96C284.7 96 256 124.7 256 160C256 162.5 256.1 164.9 256.4 167.3L174.5 212C162.8 199.7 146.3 192 128 192C92.65 192 64 220.7 64 256C64 291.3 92.65 320 128 320C146.3 320 162.8 312.3 174.5 299.1L256.4 344.7C256.1 347.1 256 349.5 256 352C256 387.3 284.7 416 320 416C355.3 416 384 387.3 384 352C384 316.7 355.3 288 320 288C304.6 288 290.5 293.4 279.4 302.5L194.1 256L279.4 209.5C290.5 218.6 304.6 224 320 224C355.3 224 384 195.3 384 160C384 124.7 355.3 96 320 96V96z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SQUARE_SHARE_NODES]. */
val FA_SHARE_ALT_SQUARE = FA_SQUARE_SHARE_NODES
