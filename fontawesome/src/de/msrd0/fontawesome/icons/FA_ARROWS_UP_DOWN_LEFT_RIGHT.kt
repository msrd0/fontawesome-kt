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

object FA_ARROWS_UP_DOWN_LEFT_RIGHT: Icon {
	
	override val name get() = "Arrows up down left right"
	
	override val unicode get() = "f047"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 255.1c0 8.188-3.125 16.41-9.375 22.66l-72 72C424.4 356.9 416.2 360 408 360c-18.28 0-32-14.95-32-32c0-8.188 3.125-16.38 9.375-22.62L402.8 288H288v114.8l17.38-17.38C311.6 379.1 319.8 376 328 376c18.28 0 32 14.95 32 32c0 8.188-3.125 16.38-9.375 22.62l-72 72C272.4 508.9 264.2 512 256 512s-16.38-3.125-22.62-9.375l-72-72C155.1 424.4 152 416.2 152 408c0-17.05 13.73-32 32-32c8.188 0 16.38 3.125 22.62 9.375L224 402.8V288H109.3l17.38 17.38C132.9 311.6 136 319.8 136 328c0 17.05-13.73 32-32 32c-8.188 0-16.38-3.125-22.62-9.375l-72-72C3.125 272.4 0 264.2 0 255.1s3.125-16.34 9.375-22.59l72-72C87.63 155.1 95.81 152 104 152c18.28 0 32 14.95 32 32c0 8.188-3.125 16.38-9.375 22.62L109.3 224H224V109.3L206.6 126.6C200.4 132.9 192.2 136 184 136c-18.28 0-32-14.95-32-32c0-8.188 3.125-16.38 9.375-22.62l72-72C239.6 3.125 247.8 0 256 0s16.38 3.125 22.62 9.375l72 72C356.9 87.63 360 95.81 360 104c0 17.05-13.73 32-32 32c-8.188 0-16.38-3.125-22.62-9.375L288 109.3V224h114.8l-17.38-17.38C379.1 200.4 376 192.2 376 184c0-17.05 13.73-32 32-32c8.188 0 16.38 3.125 22.62 9.375l72 72C508.9 239.6 512 247.8 512 255.1z"/></svg>"""
		else -> null
	}
	
}

val FA_ARROWS = FA_ARROWS_UP_DOWN_LEFT_RIGHT
