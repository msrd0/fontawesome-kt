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

/** Person skiing nordic */
object FA_PERSON_SKIING_NORDIC: Icon {
	
	override val name get() = "Person skiing nordic"
	
	override val unicode get() = "f7ca"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M336 96C362.5 96 384 74.5 384 48S362.5 0 336 0S288 21.5 288 48S309.5 96 336 96zM552 416c-13.25 0-24 10.75-24 24s-10.75 24-24 24h-69.5L460 285.6c11.75-4.75 20.04-16.31 20.04-29.69c0-17.75-14.38-31.95-32.01-31.95l-43.9-.0393l-26.11-53.22c-12.5-25.5-35.5-44.12-61.75-50.87l-71.22-21.15c-7.475-1.819-15.08-2.693-22.59-2.693c-20.86 0-41.25 6.854-58.16 19.72L124.6 146.2C116.3 152.5 111.1 161.1 111.1 171.6c0 14.71 8.712 21.23 9.031 21.6L66.88 464H24C10.75 464 0 474.8 0 488S10.75 512 24 512h480c39.75 0 72-32.25 72-72C576 426.8 565.3 416 552 416zM291.6 463.9H194.7l43.1-90.97l-21.99-12.1c-12.13-7.25-21.99-16.89-29.49-27.77l-62.48 131.7L99.5 464l52.25-261.4c4.125-1 8.112-2.846 11.74-5.596l39.81-30.45c5.821-4.485 12.86-6.771 19.38-6.771c2.021 0 4.015 .212 5.878 .6556l14.73 4.383L205.8 252.2C202.3 260.3 200.7 268.9 200.7 277.3c0 22.06 11.42 43.37 31.41 55.22l84.97 50.15L291.6 463.9zM402.1 464l-43.58-.125l23.6-75.48c1.221-4.314 1.805-8.69 1.805-13.03c0-16.53-8.558-32.43-23.41-41.34l-61.21-36.1l31.32-78.23l20.26 41.36c8 16.25 24.86 26.89 43.11 26.89L427.3 288L402.1 464z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_PERSON_SKIING_NORDIC]. */
val FA_SKIING_NORDIC = FA_PERSON_SKIING_NORDIC
