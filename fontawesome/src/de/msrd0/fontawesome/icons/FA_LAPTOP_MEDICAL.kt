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

object FA_LAPTOP_MEDICAL: Icon {
	
	override val name get() = "Laptop Medical"
	
	override val unicode get() = "f812"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M232 224h56v56a8 8 0 0 0 8 8h48a8 8 0 0 0 8-8v-56h56a8 8 0 0 0 8-8v-48a8 8 0 0 0-8-8h-56v-56a8 8 0 0 0-8-8h-48a8 8 0 0 0-8 8v56h-56a8 8 0 0 0-8 8v48a8 8 0 0 0 8 8zM576 48a48.14 48.14 0 0 0-48-48H112a48.14 48.14 0 0 0-48 48v336h512zm-64 272H128V64h384zm112 96H381.54c-.74 19.81-14.71 32-32.74 32H288c-18.69 0-33-17.47-32.77-32H16a16 16 0 0 0-16 16v16a64.19 64.19 0 0 0 64 64h512a64.19 64.19 0 0 0 64-64v-16a16 16 0 0 0-16-16z"/></svg>"""
		else -> null
	}
	
}
