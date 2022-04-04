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

/** Beer mug empty */
object FA_BEER_MUG_EMPTY: Icon {
	
	override val name get() = "Beer mug empty"
	
	override val unicode get() = "f0fc"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M432 96H384V64c0-17.67-14.33-32-32-32H64C46.33 32 32 46.33 32 64v352c0 35.35 28.65 64 64 64h224c35.35 0 64-28.65 64-64v-32.08l80.66-35.94C493.5 335.1 512 306.5 512 275V176C512 131.8 476.2 96 432 96zM160 368C160 376.9 152.9 384 144 384S128 376.9 128 368v-224C128 135.1 135.1 128 144 128S160 135.1 160 144V368zM224 368C224 376.9 216.9 384 208 384S192 376.9 192 368v-224C192 135.1 199.1 128 208 128S224 135.1 224 144V368zM288 368c0 8.875-7.125 16-16 16S256 376.9 256 368v-224C256 135.1 263.1 128 272 128S288 135.1 288 144V368zM448 275c0 6.25-3.75 12-9.5 14.62L384 313.9V160h48C440.9 160 448 167.1 448 176V275z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BEER_MUG_EMPTY]. */
val FA_BEER = FA_BEER_MUG_EMPTY