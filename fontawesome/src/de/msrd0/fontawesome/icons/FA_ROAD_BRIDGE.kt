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

/** Road Bridge */
object FA_ROAD_BRIDGE: Icon {
	
	override val name get() = "Road Bridge"
	
	override val unicode get() = "e563"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M352 0H608C625.7 0 640 14.33 640 32V480C640 497.7 625.7 512 608 512H352C334.3 512 320 497.7 320 480V32C320 14.33 334.3 0 352 0zM456 224V288C456 301.3 466.7 312 480 312C493.3 312 504 301.3 504 288V224C504 210.7 493.3 200 480 200C466.7 200 456 210.7 456 224zM504 384C504 370.7 493.3 360 480 360C466.7 360 456 370.7 456 384V448C456 461.3 466.7 472 480 472C493.3 472 504 461.3 504 448V384zM456 64V128C456 141.3 466.7 152 480 152C493.3 152 504 141.3 504 128V64C504 50.75 493.3 40 480 40C466.7 40 456 50.75 456 64zM32 96H288V160H248V224H288V320C234.1 320 192 362.1 192 416V480C192 497.7 177.7 512 160 512H128C110.3 512 96 497.7 96 480V416C96 362.1 53.02 320 0 320V224H72V160H32C14.33 160 0 145.7 0 128C0 110.3 14.33 96 32 96zM200 160H120V224H200V160z"/></svg>"""
		else -> null
	}
	
}
