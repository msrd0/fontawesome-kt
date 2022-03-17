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

/** Hands holding */
object FA_HANDS_HOLDING: Icon {
	
	override val name get() = "Hands holding"
	
	override val unicode get() = "f4c2"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M216.1 236C205.1 222.3 185.8 219.1 172 231c-13.81 11.06-16.05 31.19-5 45l18.86 30.56C194.8 317.7 193.9 333.7 183.8 343.8c-11.79 11.79-31.2 10.71-41.61-2.305L80 256.8V104C80 81.91 62.09 64 40 64S0 81.91 0 104v204.7c0 14.54 4.949 28.65 14.03 40l120.1 151.3C141.1 507.6 150.3 512 159.1 512H256c17.67 0 32.03-14.35 32.03-32.02L288 358.4c0-21.79-7.414-42.93-21.02-59.94L216.1 236zM600 64c-22.09 0-40 17.91-40 40v152.8l-62.2 84.73c-10.41 13.02-29.83 14.09-41.61 2.305c-10.08-10.07-10.97-26.11-2.068-37.24l18.86-30.56c11.05-13.81 8.812-33.94-5-45c-13.77-11.03-33.94-8.75-44.97 5l-49.99 62.5C359.4 315.5 352 336.6 352 358.4l-.0313 121.5C351.1 497.7 366.3 512 384 512h96.02c9.713 0 18.9-4.414 24.96-12l120.1-151.3C635.1 337.4 640 323.3 640 308.7V104C640 81.91 622.1 64 600 64z"/></svg>"""
		else -> null
	}
	
}
