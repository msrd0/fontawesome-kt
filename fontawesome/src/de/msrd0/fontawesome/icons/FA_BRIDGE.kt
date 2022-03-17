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

/** Bridge */
object FA_BRIDGE: Icon {
	
	override val name get() = "Bridge"
	
	override val unicode get() = "e4c8"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M544 32C561.7 32 576 46.33 576 64C576 81.67 561.7 96 544 96H504V160H576V288C522.1 288 480 330.1 480 384V448C480 465.7 465.7 480 448 480H416C398.3 480 384 465.7 384 448V384C384 330.1 341 288 288 288C234.1 288 192 330.1 192 384V448C192 465.7 177.7 480 160 480H128C110.3 480 96 465.7 96 448V384C96 330.1 53.02 288 0 288V160H72V96H32C14.33 96 0 81.67 0 64C0 46.33 14.33 32 32 32H544zM456 96H376V160H456V96zM248 96V160H328V96H248zM200 96H120V160H200V96z"/></svg>"""
		else -> null
	}
	
}
