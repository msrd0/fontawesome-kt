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

/** Mask */
object FA_MASK: Icon {
	
	override val name get() = "Mask"
	
	override val unicode get() = "f6fa"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M288 64C39.52 64 0 182.1 0 273.5C0 379.5 78.8 448 176 448c27.33 0 51.21-6.516 66.11-36.79l19.93-40.5C268.3 358.6 278.1 352.4 288 352.1c9.9 .3711 19.7 6.501 25.97 18.63l19.93 40.5C348.8 441.5 372.7 448 400 448c97.2 0 176-68.51 176-174.5C576 182.1 536.5 64 288 64zM160 320c-35.35 0-64-28.65-64-64s28.65-64 64-64c35.35 0 64 28.65 64 64S195.3 320 160 320zM416 320c-35.35 0-64-28.65-64-64s28.65-64 64-64c35.35 0 64 28.65 64 64S451.3 320 416 320z"/></svg>"""
		else -> null
	}
	
}
