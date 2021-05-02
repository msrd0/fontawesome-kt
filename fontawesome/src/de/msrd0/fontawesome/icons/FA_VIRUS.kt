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

object FA_VIRUS: Icon {
	
	override val name get() = "Virus"
	
	override val unicode get() = "e074"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M483.55,227.55H462c-50.68,0-76.07-61.27-40.23-97.11L437,115.19A28.44,28.44,0,0,0,396.8,75L381.56,90.22c-35.84,35.83-97.11,10.45-97.11-40.23V28.44a28.45,28.45,0,0,0-56.9,0V50c0,50.68-61.27,76.06-97.11,40.23L115.2,75A28.44,28.44,0,0,0,75,115.19l15.25,15.25c35.84,35.84,10.45,97.11-40.23,97.11H28.45a28.45,28.45,0,1,0,0,56.89H50c50.68,0,76.07,61.28,40.23,97.12L75,396.8A28.45,28.45,0,0,0,115.2,437l15.24-15.25c35.84-35.84,97.11-10.45,97.11,40.23v21.54a28.45,28.45,0,0,0,56.9,0V462c0-50.68,61.27-76.07,97.11-40.23L396.8,437A28.45,28.45,0,0,0,437,396.8l-15.25-15.24c-35.84-35.84-10.45-97.12,40.23-97.12h21.54a28.45,28.45,0,1,0,0-56.89ZM224,272a48,48,0,1,1,48-48A48,48,0,0,1,224,272Zm80,56a24,24,0,1,1,24-24A24,24,0,0,1,304,328Z"/></svg>"""
		else -> null
	}
	
}
