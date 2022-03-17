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

object FA_DIAGRAM_SUCCESSOR: Icon {
	
	override val name get() = "Diagram Successor"
	
	override val unicode get() = "e47a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 416C512 451.3 483.3 480 448 480H64C28.65 480 0 451.3 0 416V352C0 316.7 28.65 288 64 288H448C483.3 288 512 316.7 512 352V416zM224 224H64C28.65 224 0 195.3 0 160V96C0 60.65 28.65 32 64 32H368C412.2 32 448 67.82 448 112V128H486.1C507.4 128 518.1 153.9 503 168.1L432.1 239C423.6 248.4 408.4 248.4 399 239L328.1 168.1C313.9 153.9 324.6 128 345.9 128H384V112C384 103.2 376.8 96 368 96H288V160C288 195.3 259.3 224 224 224V224zM64 160H224V96H64V160z"/></svg>"""
		else -> null
	}
	
}
