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

/** Arrows Left-right-to-line */
object FA_ARROWS_LEFT_RIGHT_TO_LINE: Icon {
	
	override val name get() = "Arrows Left-right-to-line"
	
	override val unicode get() = "e4ba"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M32 64C49.67 64 64 78.33 64 96V416C64 433.7 49.67 448 32 448C14.33 448 0 433.7 0 416V96C0 78.33 14.33 64 32 64zM246.6 137.4C259.1 149.9 259.1 170.1 246.6 182.6L205.3 224H434.7L393.4 182.6C380.9 170.1 380.9 149.9 393.4 137.4C405.9 124.9 426.1 124.9 438.6 137.4L534.6 233.4C547.1 245.9 547.1 266.1 534.6 278.6L438.6 374.6C426.1 387.1 405.9 387.1 393.4 374.6C380.9 362.1 380.9 341.9 393.4 329.4L434.7 288H205.3L246.6 329.4C259.1 341.9 259.1 362.1 246.6 374.6C234.1 387.1 213.9 387.1 201.4 374.6L105.4 278.6C92.88 266.1 92.88 245.9 105.4 233.4L201.4 137.4C213.9 124.9 234.1 124.9 246.6 137.4V137.4zM640 416C640 433.7 625.7 448 608 448C590.3 448 576 433.7 576 416V96C576 78.33 590.3 64 608 64C625.7 64 640 78.33 640 96V416z"/></svg>"""
		else -> null
	}
	
}
