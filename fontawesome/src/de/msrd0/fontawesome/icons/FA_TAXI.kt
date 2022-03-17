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

object FA_TAXI: Icon {
	
	override val name get() = "Taxi"
	
	override val unicode get() = "f1ba"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M352 0C369.7 0 384 14.33 384 32V64L384 64.15C422.6 66.31 456.3 91.49 469.2 128.3L504.4 228.8C527.6 238.4 544 261.3 544 288V480C544 497.7 529.7 512 512 512H480C462.3 512 448 497.7 448 480V432H128V480C128 497.7 113.7 512 96 512H64C46.33 512 32 497.7 32 480V288C32 261.3 48.36 238.4 71.61 228.8L106.8 128.3C119.7 91.49 153.4 66.31 192 64.15L192 64V32C192 14.33 206.3 0 224 0L352 0zM197.4 128C183.8 128 171.7 136.6 167.2 149.4L141.1 224H434.9L408.8 149.4C404.3 136.6 392.2 128 378.6 128H197.4zM128 352C145.7 352 160 337.7 160 320C160 302.3 145.7 288 128 288C110.3 288 96 302.3 96 320C96 337.7 110.3 352 128 352zM448 288C430.3 288 416 302.3 416 320C416 337.7 430.3 352 448 352C465.7 352 480 337.7 480 320C480 302.3 465.7 288 448 288z"/></svg>"""
		else -> null
	}
	
}

val FA_CAB = FA_TAXI
