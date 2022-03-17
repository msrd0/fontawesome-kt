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

/** Xmarks Lines */
object FA_XMARKS_LINES: Icon {
	
	override val name get() = "Xmarks Lines"
	
	override val unicode get() = "e59a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M608 32C625.7 32 640 46.33 640 64C640 81.67 625.7 96 608 96H32C14.33 96 0 81.67 0 64C0 46.33 14.33 32 32 32H608zM608 416C625.7 416 640 430.3 640 448C640 465.7 625.7 480 608 480H32C14.33 480 0 465.7 0 448C0 430.3 14.33 416 32 416H608zM7.029 167C16.4 157.7 31.6 157.7 40.97 167L96 222.1L151 167C160.4 157.7 175.6 157.7 184.1 167C194.3 176.4 194.3 191.6 184.1 200.1L129.9 256L184.1 311C194.3 320.4 194.3 335.6 184.1 344.1C175.6 354.3 160.4 354.3 151 344.1L96 289.9L40.97 344.1C31.6 354.3 16.4 354.3 7.029 344.1C-2.343 335.6-2.343 320.4 7.029 311L62.06 256L7.029 200.1C-2.343 191.6-2.343 176.4 7.029 167V167zM320 222.1L375 167C384.4 157.7 399.6 157.7 408.1 167C418.3 176.4 418.3 191.6 408.1 200.1L353.9 256L408.1 311C418.3 320.4 418.3 335.6 408.1 344.1C399.6 354.3 384.4 354.3 375 344.1L320 289.9L264.1 344.1C255.6 354.3 240.4 354.3 231 344.1C221.7 335.6 221.7 320.4 231 311L286.1 256L231 200.1C221.7 191.6 221.7 176.4 231 167C240.4 157.7 255.6 157.7 264.1 167L320 222.1zM455 167C464.4 157.7 479.6 157.7 488.1 167L544 222.1L599 167C608.4 157.7 623.6 157.7 632.1 167C642.3 176.4 642.3 191.6 632.1 200.1L577.9 256L632.1 311C642.3 320.4 642.3 335.6 632.1 344.1C623.6 354.3 608.4 354.3 599 344.1L544 289.9L488.1 344.1C479.6 354.3 464.4 354.3 455 344.1C445.7 335.6 445.7 320.4 455 311L510.1 256L455 200.1C445.7 191.6 445.7 176.4 455 167V167z"/></svg>"""
		else -> null
	}
	
}
