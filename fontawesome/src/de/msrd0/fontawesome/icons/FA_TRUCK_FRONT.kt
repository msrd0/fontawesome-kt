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

object FA_TRUCK_FRONT: Icon {
	
	override val name get() = "Truck Front"
	
	override val unicode get() = "e2b7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 80C0 35.82 35.82 0 80 0H432C476.2 0 512 35.82 512 80V368C512 394.2 499.4 417.4 480 432V480C480 497.7 465.7 512 448 512H416C398.3 512 384 497.7 384 480V448H128V480C128 497.7 113.7 512 96 512H64C46.33 512 32 497.7 32 480V432C12.57 417.4 0 394.2 0 368V80zM129.9 152.2L112 224H400L382.1 152.2C378.5 137.1 365.7 128 351 128H160.1C146.3 128 133.5 137.1 129.9 152.2H129.9zM96 288C78.33 288 64 302.3 64 320C64 337.7 78.33 352 96 352C113.7 352 128 337.7 128 320C128 302.3 113.7 288 96 288zM416 352C433.7 352 448 337.7 448 320C448 302.3 433.7 288 416 288C398.3 288 384 302.3 384 320C384 337.7 398.3 352 416 352z"/></svg>"""
		else -> null
	}
	
}
