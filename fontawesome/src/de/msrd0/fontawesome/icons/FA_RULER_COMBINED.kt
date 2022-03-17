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

object FA_RULER_COMBINED: Icon {
	
	override val name get() = "Ruler Combined"
	
	override val unicode get() = "f546"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 464V48C0 21.49 21.49 0 48 0H144C170.5 0 192 21.49 192 48V96H112C103.2 96 96 103.2 96 112C96 120.8 103.2 128 112 128H192V192H112C103.2 192 96 199.2 96 208C96 216.8 103.2 224 112 224H192V288H112C103.2 288 96 295.2 96 304C96 312.8 103.2 320 112 320H192V400C192 408.8 199.2 416 208 416C216.8 416 224 408.8 224 400V320H288V400C288 408.8 295.2 416 304 416C312.8 416 320 408.8 320 400V320H384V400C384 408.8 391.2 416 400 416C408.8 416 416 408.8 416 400V320H464C490.5 320 512 341.5 512 368V464C512 490.5 490.5 512 464 512H48C23.15 512 2.706 493.1 .2477 468.9C.0838 467.3 0 465.7 0 464z"/></svg>"""
		else -> null
	}
	
}
